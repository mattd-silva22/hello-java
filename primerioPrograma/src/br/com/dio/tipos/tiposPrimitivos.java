package br.com.dio.tipos;

public class tiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// tipo byte
		byte b;       //8bits max 255 | padrao UTF-8 // 8 BITS == 1 BYTE
		
		// armazena dados de -128 a 127 ou letras padrao UTF-8
		
		byte b1 = 127;
		byte b2 = -128;
		
		//byte b3 = 129; // error: to large 
		
		byte b4 = 'a';
		//byte b5 = 'á'; // error: 'á' nao faz parte do padrao UTF-8
		
		//tipo char 
		
		char c; //16bits | UTF-16 | alfanumerico
		char c1 = 'a';
		char c2 = 'á';
		//char c3 = 'aa'; to large;
		char c4 = 255;
		
		// tipo short
		
		short s; // numeros de 16bits
		short s1 = 32767;
		short s2 = -32768;
		//short s3 = 32768; error numero to large
		
		//tipo int 
		
		int i; // numeros de 32bits;
		
		//tipo long
		
		long l; // numeros de 64bits 
		long l1 = 124153135L; // por letra L no final
		
		
		//tipo float 
		
		float f; // armazena numeros reais de 32bit
		float f1 = 24.09f; // por letra f no final
		
		
		//tipo double
		
		double d; // numeros reais em 64bits
		
		double d1 = 10.23454263511142159;
		
		// tipo boolean
		
		boolean bo = true;
		boolean bo2 = false;
		
		// void v; é UMA palavra reservada NAO É UM TIPO.
		
		
		
		
		

	}

}
