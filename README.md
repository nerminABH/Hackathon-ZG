# Studiraj > Zaposli se Play application

**Info**

Aplikacija je napisana u Play framework-u i isti je potreban za pokretanje aplikacije. 

**Database**

Tokom rada na aplikaciji koristena je lokalna baza. 
Koristena je PostgreSQL baza i podaci su ubaceni preko csv importa. 
CSV fileovi za import u bazu su dostavljeni u repozitoriju (Jobs.csv i MainDump22.csv).

**Pokretanje**

Aplikacija se pokrece preko komandi:

```
activator
run
```

Aplikaciji se pristupa na *localhost:9000*

# RSS Parse JAR

**Preduvjeti za pokretanje**

Kreirati tabelu u bazi izvrsavanjem slijedeceg SQL koda:
  CREATE TABLE rssfeed (
  title varchar(200),
  description varchar(1000),
  link varchar(200),
  category varchar(200))
  
U istom direktoriju u kojem se nalazi JAR file potrebno je da postoji configuration.txt file (dostavljen na repozitoriju) koji je potrebno azurirati sa odgovarajucim parametrima za konekciju na bazu. Primjer:

  Databasse UR:
  jdbc:postgresql://localhost/test_1
  Database user:
  admin
  User password:
  admin

**Pokretanje**

Koristeci terminal potrebno je pozicionirati se u folder u kojem se nalazi JAR i pokrenuti ga slijedecom komandom:
java -jar RssParser.jar

Primjer input parametara: 

Provide a link to RSS feed: http://burzarada.hzz.hr/rss/rsskat1002.xml
Provide category name: Stručnjaci iz područja informatike i tehničkih znanosti
