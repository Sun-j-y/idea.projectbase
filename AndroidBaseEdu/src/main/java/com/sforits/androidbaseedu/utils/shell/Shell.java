package com.sforits.androidbaseedu.utils.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-14:06 Created by IntelliJ IDEA.
 */
public class Shell {
    public static Process execShell(String shell) {
        Runtime rt = Runtime.getRuntime();
        Process exec = null;
        try {
            exec = rt.exec(shell);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exec;
    }

    public static Map<String, Object> getResult(Process exec) {
        Map<String, Object> map = new HashMap<>();

        BufferedReader result = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName("GBK")));
        String line = null;
        try {
            while ((line = result.readLine()) != null) {
                String[] split = line.split(":", 2);

                map.put(split[0].trim(), split[split.length - 1].trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

    public static List<String> getResultList(Process exec) {
        List<String> list = new ArrayList<>();
        BufferedReader result = null;
        String line = null;

        try {
            result = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName("GBK")));
            while ((line = result.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (result != null) {
                try {
                    result.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

    public static List<String> getInput(Process exec) {

        return null;
    }
}