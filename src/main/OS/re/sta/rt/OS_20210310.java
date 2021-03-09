package re.sta.rt;

    /*  BOOT 과정

BOOT
    컴퓨터를 키면?
        BIOS가 특정 Storage 를 읽어와 bootstrap loader를 메모리에 올리고 실행함
        bootstrap loader 프로그램이 있는 곳을 찾아서 실행시킴


        ROM-BIOS ---> Memory ---> (메모리에 BIOS프로그램 코드를 올린다.)
                                     MBR ---> Memory ---> (MBR 에 있는 실행 코드(파티션 Table)를 올린다)
                                                           부트섹터 ---> Memory ---> ( 부트섹터 코드를 올린다 )
                                                                                    커널이미지 ---> Memory (실행파일)



가상 머신이란?
    하나의 하드웨어(CPU, Memory 등)에 다수의 운영체제를 설치하고, 개별 컴퓨터처럼 동작하도록 하는 프로그램


            < 일반적 >                      <가상 머신>

             프로세드들              프로세스들 프로세스들 프로세스들
                ↓                     ↓         ↓       ↓
               커널                   커널      커널      커널
                ↓                     ↓         ↓       ↓
              하드웨어                 VM1       VM2     VM3
                                      ↓         ↓       ↓
                                           가상 기계 구현
                                                ↓
                                              하드웨어

Virtual Machine Type1
    하이퍼 바이저(VMM) : 운영체제와 응용프로그램을 물리적 하드웨어에서 분리하는 프로세스
                       VMM(하이퍼바이저)라고 하는 소프트웨어가 Hardware 에서 직접 구동
                       예) Xen, KVM등


Virtual Machine Type2
    하이퍼 바이저(VMM) : VMM이라고 하는 소프트웨어가 Host OS 상위에 설치
                       예) VMWare, Parallels Desktop(MAC)


전가상화 VS 반가상화 ?
    전가상화 : 각 가상머신이 하이퍼바이저를 통해서 하드웨어와 통신
        하이퍼바이저가 마치 하드웨어인 것처럼 동작하므로, 가상머신의 OS는 자신이 가상 머신인 상태인지를 모름
           Virtual Machine1 --------> VMM --------> Hardware
                                         <명령 번역>
    반가상화 : 각 가상머신에서 직접 하드웨어와 통신
        각 가상머신에 설치되는 OS는 가상머신인 경우, 이를 인지하고, 각 명령에 하이퍼바이저 명령을 추가해서 하드웨어와 통신
           Virtual Machine1 --------> Hardware   (여기서 VMM의 역할은? resource 를 관리)


KVM이란? 리눅스커널---> 시스템 콜 ioctl()을 사용하여 하드웨어에 직접명령을 cpu에 내려 cpu에 (Intel-vt)를 실행

Docker (가상머신 vs Docker)?
    가상 머신은 컴퓨터 하드웨어를 가상화 (하드웨어 전체 추상화)
        - 하이퍼바이저 사용, 추가 os필요 등 성능 저하 이슈 존재

    Docker는 운영체제 레벨에서 별도로 분리된 실행환경을 제공(커널 추상화)
        - 마치 리눅스 처음 설치했을 때와 유사한 실행환경을 만들어주는 리눅스 컨테이너 기술 기반
        - 리눅스 컨테이너 기술이므로 macOS나 windows에 설치할 경우는 가상 머신 기반 제공공


가상 머신 정리
    Bare-Metal 방식이 가장 성능이 좋음
        - 하드웨어 직접 엑세스하기 때문
        - AWS(클라우드 컴퓨팅) 환경도 Bare-Metal 기반 가상 머신 기술 활용 (KVM)

    Docker는 경량 이미지로 실행환경을 통째로 백업, 실행 가능 (실무에 많이 사용됨)
        - Data Engineering에서 Docker로 시스템 환경 설정 + 프로그램을 한 번에 배포
        - 예) 프로그램 업데이트 -> Docker 이미지 작성 - > Jenkins로 배치잡 생성 및 실행(AWS EC2 재생 및 Docker 이미지 설치, 실행)


Java Virtual Machine?
    - 가상 머신과는 다른 목적 (응용프로그램 레벨 가상화)
    - Java 컴파일러는 CPU dependency를 가지지 않는 bytecode를 생성함
    - 이 파일을 Java Virtual Machine에서 실행함
    - 각 운영체제를 위한 Java Virtual Machine 프로그램 존재


                Java 프로그램 (.class파일) ---> 클래스 적재기 <--- Java API(.class파일)
                                                   ↓
                                                   ↓
                                                   ↓
                                    Java 해석기(Java Virtual Machine)
                                                   ↓
                                                   ↓
                                                   ↓
                                               호스트 시스템
                                           (windows, Linux, etc..)















     */











public class OS_20210310 {
}
