# SimpleMavenJunitWebApp
# demo 9.2

演示目标
课程学员：初级、中级、高级
角色：开发，测试，项目经理，产品经理
价值: 快速引入业界最佳实践，短期落地，长期规划，系统化培训与实施，能力培养，社区引荐等

范围
CI/CD/DevOps

基础
JDK
Tomcat

RedMine/GitHub/Maven/Jenkins/SonarQube/JUnit样例
Jenkins Job:
MavenGitDemo
步骤:
指定Redmine演示项目
从github取demo代码
使用Maven编译、运行JUnit
使用Maven调用SonarQube
部署war到Tomcat

效果：
手动触发完整编译
在Jenkins编译结果的变更说明中link到RedMine的记录
链接编译结果至Sonar报告
在编译结果中查看JUnit测试结果

后续
编译时从Nexus中取得依赖项
编译后将新版本存入Nexus
在测试后进行一键提权


工具链
code, GitHub
IDE
Jira/Confluence
Maven
Jenkins
SonarQube
Zephyr
Selenium
Jmeter
Docker
K8s
Hygieia
