package com.company;

public class Main{
        private String name;
        private int age;
        private String sex="女";
        private String sex1="男";
        public void introduce(){
            System.out.println("姓名："+name+"年龄："+age+"性别："+sex+"");

        }
        public void introduce1(){
            System.out.println("姓名："+name+"年龄："+age+"性别："+sex1+"");
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
        }
        public int getAge(){
            return age;

        }
        public void setAge(int a){
            age=a;
        }
            public static void main(String arge[]){
                Main per =new Main();
                Main per1=new Main();
                Main per2=new Main();
                Main per3=new Main();
                Main per4=new Main();
                Main per5=new Main();
                Main per6=new Main();
                per.setName("高艺丹");
                per1.setName("郑昱旋");
                per2.setName("徐书展");
                per3.setName("曾越");
                per4.setName("吴随");
                per5.setName("饶东");
                per6.setName("曽名扬");
                per.setAge(18);
                per1.setAge(18);
                per2.setAge(18);
                per3.setAge(18);
                per4.setAge(18);
                per5.setAge(18);
                per6.setAge(18);
                per.introduce();
                per1.introduce1();
                per2.introduce1();
                per3.introduce1();
                per4.introduce1();
                per5.introduce1();
                per6.introduce1();
            }

        }
