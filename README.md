# GoTrip - Git & GitHub說明

## 複製專案clone

 1. 先去email收信、確認成為專案貢獻者
 2. 按下確認後應直接導向GitHub上專案頁面，按 **code** 並複製專案url
 3. 開啟sourcetree，上方導覽列按 **clone** 新增專案
	 - Source Path : 貼上剛複製的此專案url
	 - Destination : 確認資料要放的位置（資料夾）
	 - 按確認後專案就clone成功了

## 建立分支branch
1. 在sourcetree點選上方 **branch**建立分支，New Branch名稱以**個人負責項目**命名(hotel, ticket, member, order…)
2. 建立後確認左方你的branch是被選取的狀態
!!!  未來commit和push前都要確認在此branch作業，不要用master！

## 新增專案到workspace
1. 開啟eclipse專案開始 import : existing project into wrokspace，option欄位**勿勾選**"copy projects into workspace"，才能確定是同一個GitHub repository
3. 專案import 成功就開始寫code吧！

## 儲存專案commit
git說明 : git算是紀錄專案修改的**重要的**時間點，例如 : 「完成基本MVC」、「資料傳遞全部改為RESTful api + Ajax」、「測試Entity增加新欄位」，要是只改幾行code或是還沒debug完，請一般存檔就好，不用每日或每次修改都git

1. 查看sourcetree，有修改或新增的檔案應該有自動顯示出來
2. 在source確認左側是選到你的項目的branch
3. 按**Stage All**儲存全部，讓更動過的檔案去暫存區
4. 按下上方commit，輸入本次新增修正的說明（中文就好、請言簡意賅），不要有「20220627修改」這種沒有意義的commit

## GitHub同步你的修改
1. Sourcetree上方導覽列按push，並下確認。
2. 成功後可以到專案GitHub確認此branch是否有成功同步完成。

## 之後的操作
之後有更動code就是不斷的commit和push
