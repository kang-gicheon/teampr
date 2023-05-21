package user;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import common.DateConverter;
import dto.OrderVO;
public class PaymentService {
	Scanner scanner = new Scanner(System.in);
	private String userName;
	private String orderName;
	private int payMoney;
	private Date payDate;
	public int getPayMoney() {
		return payMoney;
	}
	public void setPayDate(Date dd) {
		this.payDate = dd;
	}
	
	public PaymentService(OrderVO vo) {
		init();
		this.userName = vo.getUserName();
		this.orderName = vo.getOrderName();
		this.payMoney = vo.getPayMoney();
	}
	
	private void init() {
		System.out.println("결제 방식을 선택해주세요.");
		System.out.println("▶1.신용카드 ▶2.실시간 계좌이체 ▶3.무통장 입금 ▶4.종료하기");
		System.out.print("번호를 입력해주세요: ");
		String number = scanner.nextLine();
		while(!Pattern.matches("^[1-8]", number)||number.length()!=1) {
			System.out.println("결제 방식을 다시 선택해주세요.");
			System.out.println("▶1.신용카드 ▶2.실시간 계좌이체 ▶3.무통장 입금 ▶4.종료하기");
			System.out.print("번호를 입력해주세요: ");
			number = scanner.nextLine();
		}
		int number2 = Integer.parseInt(number);
		
		switch(number2) {
		case 1: creditPay(); break;
		case 2: accountTransfer(); break;
		case 3: deposit(); break;
		case 4: break;
		}
		
	}
	
	private void creditPay() {
		System.out.println("                ** 신용카드 결제 **                  ");
		int cardComp = cardCompanyCheck();
		String cardNumber = cardNumberCheck();
		int cardPassword = cardPasswordCheck();
		
		System.out.println("                ** 결제 정보 확인 **                  ");
		System.out.println();
	}
	public int cardCompanyCheck() {
		int number2;
		System.out.println("1. 거래하실 신용카드를 선택해주세요.");
		System.out.println("*삼성카드와 현대카드로 결제하시면 5% 할인받으실 수 있습니다.");
		System.out.println("1.삼성카드(5% 할인)      2.하나카드	         3.국민카드		        4.신한카드");
		System.out.println("5.농협카드		         6.우리카드	         7.현대카드(5% 할인)		8.롯데카드");
		System.out.println("0.이전단계로 돌아가기");
		
		while(true) {
			System.out.print("▶카드사 선택:");
			String number = scanner.nextLine(); 
			if(!Pattern.matches("^[1-8]", number)) {
				System.out.println("잘못 입력하셨습니다. 1에서 8까지 숫자만 입력해주세요.");
			}else {
				number2 = Integer.parseInt(number);
				if(number2>8 || number2 < 1) {
					System.out.println("잘못 입력하셨습니다. 선택하신 번호는 존재하지 않습니다.");
					System.out.println("1에서 8까지 숫자만 입력해주세요.");
				}else {
					break;
				}
			}
		}
		return number2;
	}
	
	public String cardNumberCheck() {
		String result = null;
		String result2 = null;
		int number = 0;
		System.out.println("2. 카드번호 16자리를 입력해주세요.");
		
		while(true) {
			System.out.print("▶카드번호입력: ");
			result = scanner.nextLine();
			if(!Pattern.matches("^[1-8]", result)) {
				System.out.println("잘못 입력하셨습니다. 숫자만 입력해주세요.");
			}else if(result.length()!=16) {
				System.out.println("잘못 입력하셨습니다. 숫자 16자리를 입력해주세요.");
			}else {
				result2 = String.format("%s-%s-%s-%s", result.substring(0,3),
						result.substring(4,7),
						result.substring(8,11),
						result.substring(12,15));
				System.out.println("입력하신 카드 번호는 "+result2+ "입니다.");
				System.out.println("정보가 맞으십니까 1.예 2.아니오 3.돌아가기");
				System.out.print("확인: ");
				number = scanner.nextInt();
				if(number == 1) {
					break;
				}else if(number == 2){
					
				}else {
					creditPay();
					break;
				}
			}
		}
		return result2;
	}
	public int cardPasswordCheck() {
		System.out.println("카드 비밀번호 4자리를 입력해주세요.");
		System.out.print("비밀번호:");
		String number = scanner.nextLine();
		int number2 = 0;
		while(!Pattern.matches("^[0-9]", number) || number.length()!=4) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("비밀번호:");
			number = scanner.nextLine();
		}
		number2 = Integer.parseInt(number);
		return number2;
	}
	
	public void accountTransfer() {
		System.out.println("                ** 실시간 계좌 이체 **                  ");
		System.out.println("1. 출금은행을 선택해주세요.");
		System.out.println("1. 산업은행   2. IBK기업은행 3.농협중앙회    4.국민은행");
		System.out.println("5. SC제일은행 6.우리은행     7.국민은행     8.하나은행");
		int bank = checkBank();
		String accountNumber = checkAccountNumber();
		int password = checkBankPassword();
		
	}
	
	public int checkBank() {
		int number = 0;
		String answer;
		System.out.println("▶은행 선택:");
		answer = scanner.nextLine();
		while(!Pattern.matches("^[1-8]",answer)|| answer.length()!=1) {
			System.out.println("잘못 선택하셨습니다. 1번에서 8번까지 은행을 선택해 주세요.");
			System.out.print("▶은행 선택:");
			answer = scanner.nextLine();
		}
		number = Integer.parseInt(answer);
		return number;
	}
	
	public String checkAccountNumber() {
		System.out.println("2. 계좌번호 6자리를 입력해주세요.");
		System.out.print("▶계좌 번호 입력: ");
		String answer = scanner.nextLine();
		while(!Pattern.matches("^[0-9]", answer) || answer.length()!=6) {
			System.out.println("잘못 입력하셨습니다. 계좌번호를 다시 입력해주세요.");
			System.out.print("▶계좌 번호 입력: ");
			answer = scanner.next();
		}
		return answer;
	}
	public int checkBankPassword() {
		System.out.println("3. 계좌 비밀번호 4자리를 입력해주세요.");
		System.out.print("계좌 비밀번호 입력: ");
		String answer = scanner.nextLine();
		while(!Pattern.matches("^[0-9]", answer) || answer.length()!=4) {
			System.out.println("잘못 입력하셨습니다. 계좌비밀번호를 다시 입력해주세요.");
			System.out.print("계좌 비밀번호 입력: ");
			answer = scanner.nextLine();
		}
		return Integer.parseInt(answer);
	}
	
	public void deposit() {
		System.out.println("                ** 무통장 입금 **                  ");
		System.out.println("아래의 계좌로 기한 내 입금해주세요.");
		System.out.println("-------------------------------------------------");
		System.out.print("입금 기한: ");
		System.out.print(DateConverter.untilDate());
		System.out.print("입금 금액: ");
		System.out.println(payMoney);
		System.out.println("입금 계좌");
		System.out.println("하나은행 100100 예금주: (주)삼조");
		System.out.println("우리은행 123456 예금주: (주)삼조");
		System.out.println("국민은행 135531 예금주: (주)삼조");
		PaymentThread t = new PaymentThread(this);
		t.run();
	}
	
	public void orderInfo() {
		System.out.println("결제 정보 확인");
		System.out.print("입금자명: ");
		System.out.println(userName);
		System.out.print("주문상품 리스트: ");
		
		System.out.println(orderName);
		System.out.print("결제금액: ");
		System.out.print(payMoney);
		System.out.print("결제일시: ");
		setPayDate(DateConverter.payDay());
		System.out.println(payDate);
		
		System.out.println("---------- 결제가 완료되었습니다. ----------");
	}
	
	public void depositInfo() {
		System.out.println("하나은행 100100 예금주: (주)삼조");
		System.out.println("우리은행 123456 예금주: (주)삼조");
		System.out.println("국민은행 135531 예금주: (주)삼조");
	}
}
