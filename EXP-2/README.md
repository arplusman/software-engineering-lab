# گزارش کار آزمایش شماره ۲
در این آزمایش ابتدا مثال داده‌شده را انجام داده و تست‌های آن را اجرا می‌کنیم. سپس،‌ مسئله‌ی داده‌شده را با توجه به شرایط خواسته‌شده تعریف و تست می‌کنیم.
## اجرای مراحل فایل `Example.pdf`
ابتدا یک پروژه Maven ایجاد می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225622844-6fb7df7f-68ff-4b32-bd06-93faf00a3ebe.png)


مشاهده می‌کنیم که پروژه‌ی ما ساخته شده‌است:

![image](https://user-images.githubusercontent.com/45389988/225622899-5a4abd0c-83f5-49f5-ae01-ef1068d9574e.png)

سپس dependencyهای لازم را به فایل `pom.xml` اضافه می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623026-2d090510-8d8d-4060-a2ed-e1b1b9283da7.png)

با اجرای `Maven->Test` پیام `BUILD SUCCESS` را مشاهده می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623146-ae9a92f5-80c7-4550-8ce7-129e832093f3.png)

سپس، طبق توضیحات فایل، یک پکیج با نام `resources` می‌سازیم و آن را به عنوان ریشه‌ی منابع (resources root) تعریف می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623223-e4b69923-ecb9-4d12-b571-330312a11ed3.png)

سپس، دو پکیج `calculator` و `features` را طبق توضیحات فایل ایجاد می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623271-2f9e307d-f90c-491b-860f-db9e463256c2.png)

سپس، متدهای موردنظر را در فایل `MyStepDefs` تعریف می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623343-8b5cb040-bbaa-45e6-8212-964b7fc680d5.png)

فایل `Calculator.java` را در مسیر گفته‌شده ایجاد می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623432-f3f827e5-c8c6-43cb-8c7c-b914f90d829a.png)

از `Maven->test` دوباره run میگیریم تا با موفقیت اجرا شود:

![image](https://user-images.githubusercontent.com/45389988/225623474-5cb9db22-fe28-4485-899e-9495ef6efd02.png)

در این مرحله، متأسفانه با یک ارور غیرمنطقی مواجه شدیم که قابل اصلاح نبود. به همین دلیل ورژن JDK را تغییر داده و تمامی مراحل بالا را از اول انجام داده‌ایم. سپس با اجرای `calculator.feature` مشاهده می‌کنیم که سناریوی این feature اجرا شده‌است:

![image](https://user-images.githubusercontent.com/45389988/225623534-6f0303d9-9db4-463e-ae3a-d0a779ab6d84.png)

با ساختن کلاس `RunnerTest` و زدن فلش سبزرنگ با پیام زیر مواجه می‌شویم:

![image](https://user-images.githubusercontent.com/45389988/225623737-3aebfede-149d-4e42-a781-caedaf084b17.png)

با مشخص‌کردن مسیر تست این ارور را برطرف می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623774-4a8b84b6-a68d-43bd-980a-759dbc6b6656.png)

با تغییر مقادیر `feature` مشاهده می‌کنیم که نتیجه‌ی اجرای تست هم تغییر می‌کند:

![image](https://user-images.githubusercontent.com/45389988/225623856-95359eb8-2b6b-4426-82f8-ae2284f1a6d5.png)

حال، Scenario outlineها را به فایل `calculator.feature` اضافه می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225623948-33d7c0b0-3abf-43e3-a2d4-493311673365.png)

پس از آن `RunnerTest` را اجرا می‌کنیم ولی مشاهده می‌کنیم که ۱ تست به صورت undefined می‌باشد. مشکل این تست به خاطر وجود عدد -1 در تست دوم در scenario outline می‌باشد. برای رفع این مشکل در فایل `MyStepdefs.java` تغییرات زیر را در رجکس آن اعمال می‌کنیم تا اعداد منفی را نیز پوشش دهد:

![image](https://user-images.githubusercontent.com/45389988/225624170-275d5ae8-fe3a-4023-b65e-a554eb674a3a.png)

سپس، دوباره `RunnerTest` را اجرا می‌کنیم و مشاهده می‌کنیم که این بار تمامی تست‌ها با موفقیت اجرا می‌شوند:

![image](https://user-images.githubusercontent.com/45389988/225624230-6cf322c0-2eab-494a-b4e7-1f6c60eb1fde.png)

## مسئله

در فایل `Calculator.java` تابع جدید `calculate` را مطابق با خواسته‌ی مسئله تعریف می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225624349-49e16f14-633c-4897-b777-23648aeca76f.png)

در فایل `MyStepdefs.java` مطابق با سناریوهایی که می‌خواهیم اضافه کنیم، توابع جدید را تعریف می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225624415-5d18ccd1-2952-4b88-a99a-583765d5571d.png)

سپس در فایل `calculator.feature` سناریوهای جدید را اضافه می‌کنیم:

![image](https://user-images.githubusercontent.com/45389988/225624483-d2ec7aa6-f56d-448c-aeb1-91b1482c1a68.png)

با اجرای مجدد `RunnerTest.java` خواهیم داشت:

![image](https://user-images.githubusercontent.com/45389988/225624555-72792d7c-b887-4042-9c7a-d0c500427cbf.png)

مشاهده می‌کنیم که تمامی اجرای تمامی تست‌ها موفقیت‌آمیز بود و تمامی سناریوها به درستی اجرا شده‌اند.
