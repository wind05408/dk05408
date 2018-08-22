package com.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author: dk05408
 * @date: 2018/8/7 18:51
 * Description:
 */
public class QueueDemo {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<String>();
//        queue.add("1团队");
//        queue.add("2营业部");
//        queue.add("分部");
//        queue.add("区域");
//
////        queue.poll();
////        queue.poll();
////        queue.poll();
//        StringBuffer sb=new StringBuffer();
//        while(!queue.isEmpty()) {
//            sb.append(queue.poll()+"-");
//        }
//        System.out.println(sb.toString());
        String sql ="UPDATE  hx_lc_um_user set id=Q23Q WHERE id=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_ext set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_train_work set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_social_security set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_salary set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_reward_punishment set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_org_position_relation set user_id=Q23Q WHERE user_id=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_leader set user_id=Q23Q WHERE user_id=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_leader set leader_id=Q23Q WHERE leader_id=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_emergency_person set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_education set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_contract set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_become set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user set recommend_uid=Q23Q WHERE recommend_uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_approval set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_approval_record set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_salary_renew set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_move_info set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_leave set uid=Q23Q WHERE uid=Q12345Q;\n" +
                "UPDATE  hx_lc_um_org_leader set user_id=Q23Q WHERE user_id=Q12345Q;\n" +
                "UPDATE  hx_lc_um_user_role_relation set user_id=Q23Q WHERE user_id=Q12345Q;\n";


        String [] a1 ={"564",
                "984",
                "737",
                "1775",
                "1517",
                "1729",
                "1832",
                "2004",
                "3268",
                "3372",
                "4366",
                "3768",
                "4137",
                "4934",
                "4471",
                "5149",
                "5436",
                "5563",
                "5717",
                "5980",
                "6040",
                "6376",
                "6434",
                "2962",
                "6527",
                "2174",
                "6538",
                "6548",
                "6544",
                "6545",
                "6543",
                "6542",
                "6554",
                "6547",
                "6546",
                "6555",
                "6552",
                "6549",
                "6550",
                "6551",
                "6537",
                "6535",
                "6534",
                "6533",
                "6536",
                "6553",
                "6532",
                "6541",
                "6539",
                "6559",
                "6528",
                "6531",
                "6529",
                "6530",
                "2767",
                "6564",
                "6558",
                "6563",
                "6557"
        };

        int[][] arr = {
                {100157,6567},
                {100158,6566},
                {100159,6562},
                {100160,6565},
                {100161,6569},
                {100162,6570},
                {100164,6560},
                {100165,4592},
                {100167,6561},
                {100168,6568},
                {100169,5949}
        };

        System.out.println(arr.length);
        System.out.println(arr[0][0]+" "+arr[0][1]);
        String s1= "";
        for (int i = 0; i < arr.length; i++) {
            s1 += sql.replaceAll("Q12345Q",String.valueOf(arr[i][0])).replaceAll("Q23Q",String.valueOf(arr[i][1])).toString();
//
            s1+="############"+(i+1)+"###########\n";
// try {
//                File file = new File("D:\\hx-file\\crm\\test\\"+arr[i][1]+".sql");
//                PrintStream ps = new PrintStream(new FileOutputStream(file));
//                ps.println(s1);// 往文件里写入字符串
////                ps.append("http://www.jb51.net");// 在已有的基础上添加字符串
//            } catch (FileNotFoundException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
        }

        try {
            File file = new File("D:\\hx-file\\crm\\test\\"+"total0814.sql");
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.println(s1);// 往文件里写入字符串
//                ps.append("http://www.jb51.net");// 在已有的基础上添加字符串
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//        String s1 = sql.replaceAll("627","6182").replaceAll("100014","100017").toString();
//        System.out.println(s1);
//
//        String s2 = sql.replaceAll("627","6182").replaceAll("100014","100017").toString();
//        System.out.println(s2);
//
//
//        String s1 = sql.replaceAll("627","6182").replaceAll("100014","100017").toString();
//        System.out.println(s1);



    }
}
