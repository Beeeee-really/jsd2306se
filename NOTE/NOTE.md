## MySQL

### 登录与登出

- **登录远端服务器** mysql -u(用户名) -h(ip地址) -P(端口号) -p(密码)
- **登陆本地服务器** mysql -u(用户名) -p(密码)
- **登出** exit *(ctrl+c)*

## SQL

> 编程语言

- SQL是Structured Query Language的缩写，翻译成中文为结构化查询语言
- SQL是与数据库进行交互的一种标准，但是不同数据库会有基于SQL的一些不同实现

### SQL的用处

- 创建数据库中的对象
- 访问数据库中的对象
- 更新数据库中的数据

### SQL类型

> 不同类型的SQL语法不同
> <p></p>
> 基于业务选择不同的SQL进行应用

- 数据定义语言，用于操作数据库对象 [数据库，表，视图，索引，...\]

#### DDL:数据操纵语言,用于操作(添加，修改，删除，查询)表中数据

#### DQL:数据查询语言,用于查询数据库中的数据

#### TCL:TCL（Tool Command Language）是一种脚本编程语言，在数据库中通常被用于编写存储过程和触发器。TCL提供了一系列的命令和语法，可以用于控制程序流程、执行数据库操作以及处理数据

## 数据库基本操作

### 语法增强

#### 案例演示

<p>获取创建数据库的详细语法</p>

```mariadb
help 'create database';
# 或者:
# ? 'create database';
```

<p></p>


<p>创建数据库</p>

```mariadb
# create or replace database db1;
```

<p>查看有哪些字符集</p>

```mariadb
show character set like '%utf8%';
# 只要包含utf8
# 为前或后包含字符
# like模糊判断
```

<p></p>

![屏幕截图 2023-08-08 163658.png](屏幕截图%202023-08-08%20163658.png)

<p>注释</p>

```sql
COMMENT
'qwq';-- 注释
```

### 创建数据库

```mariadb
create database qwq character set = utf8;
#                  数据库的名字 编码方式
#     可小写
#     推荐大写
```

#### 案例演示

<p>创建一个名字为jsd2306的数据库</p>

```mariadb
create database jsd2306;
```

数据库无法重复创建

<p>因此</p>

![屏幕截图 2023-08-08 152410.png](屏幕截图%202023-08-08%20152410.png)

```mariadb
# 当数据库不存在时创建数据库
create database if not exists jsd2306 character set utf8mb4;
# 替换或创建数据库
create or replace database ntd;
```

<p></p>

![屏幕截图 2023-08-08 152608.png](屏幕截图%202023-08-08%20152608.png)

### 删除数据库

```mariadb
drop database if exists 数据库名字;
```

#### 案例演示

<p>删除名为jsd2306的数据库</p>

```mariadb
drop database if exists jsd2306;
```

### 查看数据库

#### 查看所有数据库

```mariadb
show databases;
```

### 使用数据库

<p>切换/打开</p>

````mariadb
use spl;
````

#### 案例演示

```mariadb
use sql;
use jsd2306;
```

### 查看数据库中所有的表

```mariadb
show tables;
```

### 创建表

<p></p>

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
|---|---|---|---|---|---|---|---|---|
| 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
| 2 | 2 | 2 | 2 | 2 | 2 | 2 | 2 | 2 |
| 3 | 3 | 3 | 3 | 3 | 3 | 3 | 3 | 3 |

<p></p>

```mariadb
# create table jsd2306
# (
    #字段名 字段类型 字段约束,字段名 字段类型 字段约束,字段名 字段类型 字段约束,字段名 字段类型 字段约束,字段名 字段类型 字段约束,...
# );编码与数据库一致
```

#### 案例演示

<p>创建一个表</p>

```mariadb
create table if not exists class(# 不存在才创建
    id int primary key comment '班级id',# 主键约束:此id的值必须是唯一的，并且不允许为空(null)
    name varchar(50) comment '班级名称',# 50个字符 可变字符类型 允许字段为空(null)
    create_date date comment '班级创建日期'# date日期类型
)
```
<p></p>

![屏幕截图 2023-08-08 174027.png](屏幕截图%202023-08-08%20174027.png)


### 删除表

```mariadb
# drop table class;# 表名
```




