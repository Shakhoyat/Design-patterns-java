@echo off
echo Testing all Design Patterns...
echo.

echo ========================================
echo 1. SINGLETON PATTERN
echo ========================================
cd "1.singleton"
javac Singleton.java
java SingletonDemo
echo.

echo ========================================
echo 2. FACTORY PATTERN
echo ========================================
cd "..\2.factory"
javac Factory.java
java FactoryDemo
echo.

echo ========================================
echo 3. ADAPTER PATTERN
echo ========================================
cd "..\3.Adapter"
javac Adapter.java
java AdapterDemo
echo.

echo ========================================
echo 4. BRIDGE PATTERN
echo ========================================
cd "..\4.Bridge"
javac Bridge.java
java BridgeDemo
echo.

echo ========================================
echo 5. FLYWEIGHT PATTERN
echo ========================================
cd "..\5.Flyweight"
javac Flyweight.java
java FlyweightDemo
echo.

echo ========================================
echo 6. PROXY PATTERN
echo ========================================
cd "..\6.proxy"
javac Proxy.java
java ProxyDemo
echo.

echo ========================================
echo ALL TESTS COMPLETED!
echo ========================================
cd ..