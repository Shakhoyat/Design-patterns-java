Write-Host "Testing all Design Patterns..." -ForegroundColor Green
Write-Host ""

Write-Host "========================================" -ForegroundColor Yellow
Write-Host "1. SINGLETON PATTERN" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Yellow
Set-Location "1.singleton"
javac Singleton.java
java SingletonDemo
Write-Host ""

Write-Host "========================================" -ForegroundColor Yellow
Write-Host "2. FACTORY PATTERN" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Yellow
Set-Location "..\2.factory"
javac Factory.java
java FactoryDemo
Write-Host ""

Write-Host "========================================" -ForegroundColor Yellow
Write-Host "3. ADAPTER PATTERN" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Yellow
Set-Location "..\3.Adapter"
javac Adapter.java
java AdapterDemo
Write-Host ""

Write-Host "========================================" -ForegroundColor Yellow
Write-Host "4. BRIDGE PATTERN" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Yellow
Set-Location "..\4.Bridge"
javac Bridge.java
java BridgeDemo
Write-Host ""

Write-Host "========================================" -ForegroundColor Yellow
Write-Host "5. FLYWEIGHT PATTERN" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Yellow
Set-Location "..\5.Flyweight"
javac Flyweight.java
java FlyweightDemo
Write-Host ""

Write-Host "========================================" -ForegroundColor Yellow
Write-Host "6. PROXY PATTERN" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Yellow
Set-Location "..\6.proxy"
javac Proxy.java
java ProxyDemo
Write-Host ""

Write-Host "========================================" -ForegroundColor Green
Write-Host "ALL TESTS COMPLETED!" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green
Set-Location ".."