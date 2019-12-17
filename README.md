## Codemaster Community

## Recourse
[Spring file](https://spring.io/guides)  
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[es](https://elasticsearch.cn/explore)  
[Bootstrap](https://v3.bootcss.com/getting-started/)  
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Spring](https://docs.spring.io/spring-boot/docs/2.2.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)
## Tools
[Git](https://git-scm.com/download_)  
[Visual Paradigm](https://www.visual-paradigm.com_)  
[Flyway](https://flywaydb.org/getstarted/firststeps/maven) 
[Lombok](https://www.projectlombok.org)  
[thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)

## Script
```create table USER
   (
   	ID INTEGER default NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_448204EB_C390_4431_BF5E_6B432E131D37" auto_increment,
   	ACCOUNT_ID VARCHAR(100),
   	NAME VARCHAR(50),
   	TOKEN CHAR(36),
   	GMT_CREATE BIGINT,
   	GMT_MODIFIED BIGINT,
   	constraint USER_PK
   		primary key (ID)
   );

```