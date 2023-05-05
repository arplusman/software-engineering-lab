ابتدا تست مربوط به مستطیل را می‌نویسیم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 49 22 PM" src="https://user-images.githubusercontent.com/45389988/236565670-d78573b6-33f3-4334-aefb-43b56658fd11.png">

با اجرای تست مشاهده می‌کنیم که نمی‌تواند کلاس مربوطه را پیدا کند:

<img width="1680" alt="Screenshot 1402-02-15 at 11 49 32 PM" src="https://user-images.githubusercontent.com/45389988/236565795-18114fb6-486f-477f-99c7-d18a4d318412.png">

پس، کلاس `Rectangle` را پیاده‌سازی می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 53 13 PM" src="https://user-images.githubusercontent.com/45389988/236565881-c55adf32-10b0-407a-b07c-047e98b63f54.png">

دوباره تست را اجرا می‌کنیم و این بار با ارور زمان اجرا مواجه می‌شویم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 53 13 PM" src="https://user-images.githubusercontent.com/45389988/236566075-cfb9bc6b-5773-473c-a6db-03562c505b0b.png">

اشکالات موجود در کد را برطرف می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 53 18 PM" src="https://user-images.githubusercontent.com/45389988/236566106-0043c924-a3b0-4f9a-a769-3006589bb068.png">

دوباره تست‌ها را اجرا می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 53 32 PM" src="https://user-images.githubusercontent.com/45389988/236566150-15820944-43fd-4d30-901a-7d9e32d3e598.png">

مشاهده می‌کنیم که تست مورد نظر پاس شده‌است. حال، تست مربوط به متدهای `get` و `set` را می‌نویسیم و با اجرای آن با خطاهای کامپایلری زیر مواجه می‌شویم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 59 40 PM" src="https://user-images.githubusercontent.com/45389988/236566289-56a14372-bf4f-461a-bc5b-800e09025131.png">

متدهای مورد نظر را پیاده‌سازی می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-15 at 11 59 46 PM" src="https://user-images.githubusercontent.com/45389988/236566462-426477d1-37b3-47cf-899f-9faf9537d534.png">

تست‌ها را دوباره اجرا می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-16 at 12 00 03 AM" src="https://user-images.githubusercontent.com/45389988/236566631-e793f4b6-9bd3-4fa6-83e8-b8c14e033a48.png">

برای این کار ابتدا اینترفیس `Shape` را تعریف می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-16 at 12 01 57 AM" src="https://user-images.githubusercontent.com/45389988/236566743-f3a8fe75-5f38-48d3-9534-1b8754b64be5.png">

سپس کلاس `Shape` را از این اینترفیس ارث‌بری می‌کنیم:


<img width="1680" alt="Screenshot 1402-02-16 at 12 02 17 AM" src="https://user-images.githubusercontent.com/45389988/236566882-1968c37f-6ead-4876-bb23-a176abbc61e1.png">

حال، تست‌های مربوط به کلاس `Square` را می‌نویسیم:

<img width="1680" alt="Screenshot 1402-02-16 at 12 11 07 AM" src="https://user-images.githubusercontent.com/45389988/236566990-94a6d9b0-9edf-4f10-90f2-fc19049bd48d.png">

ارورهای زمان کامپایل را مشاهده می‌کنیم. پس پیاده‌سازی این کلاس را انجام می‌دهیم:

<img width="1680" alt="Screenshot 1402-02-16 at 12 11 16 AM" src="https://user-images.githubusercontent.com/45389988/236567119-732bcffd-cafd-436c-a0f2-03025775c596.png">

با اجرای تست‌ها ارورهای زمان اجرا را مشاهده می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-16 at 12 11 25 AM" src="https://user-images.githubusercontent.com/45389988/236567217-62d57e84-1611-4e06-bee6-d9953574ad72.png">

با تغییر منطق برنامه، اشکالات موجود را برطرف می‌کنیم:

<img width="1680" alt="Screenshot 1402-02-16 at 12 11 41 AM" src="https://user-images.githubusercontent.com/45389988/236567277-e6a9b657-d2ea-4f59-acff-a89d57d276d8.png">

مشاهده می‌کنیم که تمامی تست‌ها با موفقیت پاس شده‌اند.






