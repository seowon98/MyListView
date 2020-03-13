# ListView
Pratice of Android Studio

여러 개의 아이템 중에서 하나를 선택하는 방식을 가진 선택 위젯은 어댑터를 사용

화면에 보이는 뷰가 데이터를 관리하는 것이 아니라 어댑터가 데이터를 관리하는 방식을 사용

어댑터는 데이터를 관리하면서 동시에 위젯을 통해 보일 각각의 아이템을 위해 뷰를 만들어줌.

<div><div>
  <img src="https://user-images.githubusercontent.com/60779441/76588801-5e668e80-652b-11ea-9961-8942e728a173.jpg")
<div><div>
## 어댑터 사용 -> 데이터 관리하는 주체, view정의, index 알아야함<div><div>
1. 리스트 뷰에 들거라 각 아이템의 xml을 정의<div>
2.아이템을 위한 뷰를 정의, 각 아이템을 하나의 뷰로 정의 (xml, java파일), 이 뷰는 여러개의 뷰를 담은 뷰그룹,<div>
//이것은 부분화면!! 정의한 xml레이아웃을 인플레이션 후 설정해야 함<div>
3.어댑터 정의 : 클래스 만들고 그 안에 각 아이템으로 표시할 뷰를 리턴하는 getView()메소드 정의<div>
4.리스트뷰 정의 : 화면에 보여줄 리스트뷰 만들고 그 안에 데이터가 선택되었을 때 호출될 리스너 객체 정의<div>
 
(src: https://www.edwith.org/boostcourse-android/lecture/17057/)
