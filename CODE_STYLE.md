# 代码规范
## 1 命名风格

1.1 不要使用拼音及数字

1.2 常用缩写


A

average ——> avg

B

back ——> bk

background ——> bg

break ——> brk

buffer ——> buf

C

color ——> cr(clr)

control ——> ctrl

D

data ——> dat

delete ——> del

document ——> doc

E

edit ——> edt

error ——> err

escape ——> esc

F

flag ——> flg

form ——> frm

G

grid ——> grd

I

increment ——> inc

information ——> info

initial ——> init

insert ——> ins

image ——> img

L

label ——> lab

length ——> len

list ——> lst

library ——> lib

M

manager ——> mngr(mgr)

message ——> msg

O

Oracle ——> Ora

P

panorama ——> pano

password ——> pwd

picture ——> pic

point ——> pt

position ——> pos

print ——> prn

program ——> prg


S

server ——> srv

source ——> src

statistic ——> stat

string ——> str

Sybase ——> Syb

T

temp ——> tmp

text ——> txt

U

user ——> usr

W

window ——> wnd(win)

1.3 常量命名

常量命名全部大写，单词间用下划线分隔。力求语义表达完整清楚。

如：MAX_STOCK_COUNT

1.4 类命名

类命名采用大驼峰命名法，及每个单词首字母大写
如：FirstName

1.5 方法名、参数名、成员变量、局部变量统一使用小驼峰命名法，及除第一个单词外每个单词首字母大写。
如：firstName

1.6 除局部循环变量可以使用单个字符变量命名如(i,j,k等)，其余情况禁止使用单个字符作为变量命名。

---
## 2 常量定义
2.1 不允许任何魔法值（即未经预先定义的常量）直接出现在代码中。

2.2 在 long 或者 Long 赋值时，数值后使用大写的 L，不能是小写的 l，小写容易跟数字1 混淆，造成误解。

---
## 3 代码格式

3.1 大括号使用约定

1） 左大括号前不换行。

2） 左大括号后换行。

3） 右大括号前换行。

4） 右大括号后还有else等代码则不换行；表示终止的右大括号后必须换行

如果大括号内为空，则可以简洁地写成{}，不需要换行。

3.2 小括号使用约定

小括号与字符之间不需要空格。

3.3 if/for/while/switch/do等保留字与括号之间必须加空格。

---
## 4 集合处理
---
## 5 控制语句

5.1 在if/else/for/while/do语句中必须使用大括号，即使只有一行代码。

---
## 6 注释规约

6.1 删除被注释掉的明确停止使用的东西

---
## 7 其它
---
