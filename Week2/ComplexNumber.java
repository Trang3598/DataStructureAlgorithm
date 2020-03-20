import java.util.Scanner;

public class ComplexNumber {
	private int thuc, ao;

	public ComplexNumber() {
		thuc = 0;
		ao = 0;
	}

	public ComplexNumber(int thuc, int ao) {
		this.thuc = thuc;
		this.ao = ao;
	}

	public int getThuc() {
		return thuc;
	}

	public void setThuc(int thuc) {
		this.thuc = thuc;
	}

	public int getAo() {
		return ao;
	}

	public void setAo(int ao) {
		this.ao = ao;
	}

	public ComplexNumber cong(ComplexNumber num) {
		ComplexNumber c = new ComplexNumber();
		c.thuc = thuc + num.thuc;
		c.ao = ao + num.ao;
		return c;
	}

	public ComplexNumber nhan(ComplexNumber num) {
		ComplexNumber c = new ComplexNumber();
		c.thuc = thuc * num.thuc + ao * num.ao;
		c.ao = thuc * num.ao + ao * num.thuc;
		return c;
	}

	public String toString() {
		if (ao > 0)
			return thuc + "+" + ao + "i";
		else
			return thuc + ao + "i";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thuc1, ao1, thuc2, ao2;
		System.out.println("Nhap phan thuc so thu 1 ");
		thuc1 = sc.nextInt();
		System.out.println("Nhap phan ao so thu 1");
		ao1 = sc.nextInt();
		ComplexNumber c1 = new ComplexNumber(thuc1, ao1);
		System.out.println("Nhap phan thuc so thu 2 ");
		thuc2 = sc.nextInt();
		System.out.println("Nhap phan ao so thu 2");
		ao2 = sc.nextInt();
		ComplexNumber c2 = new ComplexNumber(thuc2, ao2);
		System.out.println("Ket qua phep cong: " + c1.cong(c2));
		System.out.println("Ket qua phep nhan: " + c1.nhan(c2));
	}
}
