package user;

import java.util.Scanner;

public class PaymentThread implements Runnable{
	PaymentService ps;
	public PaymentThread(PaymentService ps) {
		this.ps = ps;
	}

	Scanner stdIn = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("무통장 입금을 선택하셨습니다.");
		System.out.println("지금 바로 결제를 하시겠습니까? 1. 예 2. 아니오");
		System.out.print(">> ");
		int n = stdIn.nextInt();
		if(n == 1) {
			try {
				System.out.println("잠시만 기다려 주세요. 무통장 입금 모듈을 가동하고 있습니다.");
				Thread.sleep(2500);
				System.out.println("결제 정보를 가져옵니다.");
				Thread.sleep(1000);
				ps.orderInfo();
				System.out.println("입금하실 은행을 선택해주세요");
				System.out.println("1.하나은행 2. 우리은행 3.국민은행");
				int m = stdIn.nextInt();
				System.out.print("입금계좌: ");
				switch(m) {
				case 1: System.out.println("100100"); break;
				case 2: System.out.println("123456"); break;
				case 3: System.out.println("135531"); break;
				}
				System.out.print("금액:");
				int money = stdIn.nextInt();
				while(true) {
					if(money == ps.getPayMoney()) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else {
						System.out.println("금액이 일치하지 않습니다. 정확한 금액을 입력해주세요.");
						System.out.println("금액:");
						money = stdIn.nextInt();
					}
				}
			} catch(Exception e) {
				
			}
		}else {
			System.out.println("차후에 결제를 꼭 완료해주세요. 메인화면으로 돌아갑니다.");
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			return;
		}
	}
}
