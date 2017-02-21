# rest-java-boilerplate
This is a boiler-plate java webapp that you can clone, make necessary updations, build and deploy (war) to expose REST service(s).

# Versions
- JDK : 1.6.0_26
- Jersey : 1.8
- Tomcat : 7.0

# NOTE:
I researched a lot on what is the minimum set of dependencies/JARs required to implement POJO-JSON mapping. Most samples projects / examples are maven based that show 2-3 (maven) dependencies. However, it's important to note that these dependencies have a chain of dependencies within themselves too. For this sample, I took one of the maven projects (that had 2 maven dependencies), built it and extracted the set of JARs needed. I'm hoping this is the optimum set.