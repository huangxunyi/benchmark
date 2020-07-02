
> java version "11.0.7" 2020-04-14 LTS

```
# JMH version: 1.23
# VM version: JDK 11.0.7, Java HotSpot(TM) 64-Bit Server VM, 11.0.7+8-LTS
# VM invoker: jdk-11.0.7.jdk/Contents/Home/bin/java
# VM options: -Dfile.encoding=UTF-8
# Warmup: 1 iterations, 10 s each
# Measurement: 2 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.huangxunyi.DynamicProxyBench.bytebuddyDynamicProxy

# Run progress: 0.00% complete, ETA 00:01:00
# Fork: 1 of 1
# Warmup Iteration   1: 1837.078 ops/s
Iteration   1: 2822.224 ops/s
Iteration   2: 3012.382 ops/s


Result "com.huangxunyi.DynamicProxyBench.bytebuddyDynamicProxy":
  2917.303 ops/s


# JMH version: 1.23
# VM version: JDK 11.0.7, Java HotSpot(TM) 64-Bit Server VM, 11.0.7+8-LTS
# VM invoker: jdk-11.0.7.jdk/Contents/Home/bin/java
# VM options: -Dfile.encoding=UTF-8
# Warmup: 1 iterations, 10 s each
# Measurement: 2 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.huangxunyi.DynamicProxyBench.cglibDynamicProxy

# Run progress: 50.00% complete, ETA 00:00:35
# Fork: 1 of 1
# Warmup Iteration   1: WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by net.sf.cglib.core.ReflectUtils$1 (file:/Users/athos/.m2/repository/cglib/cglib/3.3.0/cglib-3.3.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of net.sf.cglib.core.ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
5872836.906 ops/s
Iteration   1: 5986496.742 ops/s
Iteration   2: 5967538.950 ops/s


Result "com.huangxunyi.DynamicProxyBench.cglibDynamicProxy":
  5977017.846 ops/s


# Run complete. Total time: 00:01:10

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                 Mode  Cnt        Score   Error  Units
DynamicProxyBench.bytebuddyDynamicProxy  thrpt    2     2917.303          ops/s
DynamicProxyBench.cglibDynamicProxy      thrpt    2  5977017.846          ops/s


```

> java version "1.8.0_251"


```
/Library/Java/JavaVirtualMachines/jdk1.8.0_251.jdk/Contents/Home/bin/java -Dfile.encoding=UTF-8 -classpath /Users/athos/GitRepo/benchmark/benchmark/dynamic-proxy/target/classes:/Users/athos/.m2/repository/cglib/cglib/3.3.0/cglib-3.3.0.jar:/Users/athos/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar:/Users/athos/.m2/repository/net/bytebuddy/byte-buddy/1.10.13/byte-buddy-1.10.13.jar:/Users/athos/.m2/repository/org/openjdk/jmh/jmh-core/1.23/jmh-core-1.23.jar:/Users/athos/.m2/repository/net/sf/jopt-simple/jopt-simple/4.6/jopt-simple-4.6.jar:/Users/athos/.m2/repository/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar:/Users/athos/.m2/repository/org/openjdk/jmh/jmh-generator-annprocess/1.23/jmh-generator-annprocess-1.23.jar org.openjdk.jmh.Main com.huangxunyi.DynamicProxyBench.*
# JMH version: 1.23
# VM version: JDK 1.8.0_251, Java HotSpot(TM) 64-Bit Server VM, 25.251-b08
# VM invoker: jdk1.8.0_251.jdk/Contents/Home/jre/bin/java
# VM options: -Dfile.encoding=UTF-8
# Warmup: 1 iterations, 10 s each
# Measurement: 2 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.huangxunyi.DynamicProxyBench.bytebuddyDynamicProxy

# Run progress: 0.00% complete, ETA 00:01:00
# Fork: 1 of 1
# Warmup Iteration   1: 2288.006 ops/s
Iteration   1: 2942.521 ops/s
Iteration   2: 2943.199 ops/s


Result "com.huangxunyi.DynamicProxyBench.bytebuddyDynamicProxy":
  2942.860 ops/s


# JMH version: 1.23
# VM version: JDK 1.8.0_251, Java HotSpot(TM) 64-Bit Server VM, 25.251-b08
# VM invoker: jdk1.8.0_251.jdk/Contents/Home/jre/bin/java
# VM options: -Dfile.encoding=UTF-8
# Warmup: 1 iterations, 10 s each
# Measurement: 2 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.huangxunyi.DynamicProxyBench.cglibDynamicProxy

# Run progress: 50.00% complete, ETA 00:00:35
# Fork: 1 of 1
# Warmup Iteration   1: 6369676.469 ops/s
Iteration   1: 5709982.048 ops/s
Iteration   2: 5735526.612 ops/s


Result "com.huangxunyi.DynamicProxyBench.cglibDynamicProxy":
  5722754.330 ops/s


# Run complete. Total time: 00:01:11

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                 Mode  Cnt        Score   Error  Units
DynamicProxyBench.bytebuddyDynamicProxy  thrpt    2     2942.860          ops/s
DynamicProxyBench.cglibDynamicProxy      thrpt    2  5722754.330          ops/s


```
