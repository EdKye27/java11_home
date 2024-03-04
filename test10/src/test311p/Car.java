package test311p;

/*
 Car 추상 클래스를 상속받는 Sonata, Avante, Grandeur, Genesis 클래스가 있습니다. 각 차 는주행하기 위해 다음순서로 움직입니다.
 
run( ) {
start( );
drive( );
stop( ); 
turnoff( )
}

run( ) 메서드는 템플릿 메서드로 구현하고 다음 출력 결과가 나오도록 Car, Sonata, Avante,
Grandeur, Genesis 클래스를 구현하세요.
 */

public abstract class Car {

	 abstract void start();
	 abstract void drive();
	 abstract void stop();
	 abstract void turnoff();

	
}
