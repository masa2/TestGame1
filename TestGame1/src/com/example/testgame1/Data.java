package com.example.testgame1;

public class Data {
	
	//�t�B�[���h�ϐ�
	int no =0;
	int flag=0;
	
	//�R���X�g���N�^
	Data(int no) {this.no=no; flag=0;}
	void setNo(int no){this.no=no;}
	
	//���\�b�h
	void comp(){this.flag=1;}
	void init(){this.flag=0;}
	int getNo(){return this.no;}
	void countupNo() {this.no++;}
	int getFlag(){return this.flag;}

}
