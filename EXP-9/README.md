## معماری Microservice

در این آزمایش ما یک سیستم که شامل ۳ زیرسیستم Generator، فرانت‌اند و بک‌اند می‌باشد را پیاده‌سازی کرده‌ایم. در این سیستم که همانند یک سیستم رمز پویا می‌باشد، یک درخواست از سمت فرانت به سمت بک‌اند برای دریافت رمز پویا فرستاده می‌شود. سپس، بک‌اند از Generator یک رمز جدید دریافت کرده و با فرمت و پیام مناسب، پاسخ را به سمت فرانت برمی‌گرداند. Generator و بک‌اند با جنگو پیاده‌سازی شده‌اند و فرانت‌اند با HTML. داکرفایل‌های مرتبط با هر زیرسرویس در پوشه‌ی مربوط به آن قرار دارد. پورت مربوط به فرانت، بک و Generator به ترتیب برابر با 80، 8000 و 8001 می‌باشد.

کد فرانت‌اند به صورت زیر می‌باشد:

<img width="1680" alt="Screenshot 1402-03-08 at 8 19 16 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/cae6160a-5e0e-45dd-bc28-fe911582fd08">

و داکرفایل آن بر روی `nginx:alpine` پیاده‌سازی شده‌است:

<img width="1680" alt="Screenshot 1402-03-08 at 8 20 05 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/faea7829-6a78-4cfa-aa79-858c7603a21c">

کد مربوط به هندل‌کردن ریکوئست فرانت در بک‌اند به صورت زیر می‌باشد:

<img width="1680" alt="Screenshot 1402-03-08 at 8 21 10 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/86833887-6a62-43d0-abc9-4a1b8ed0fd5b">

مشاهده می‌کنیم که این View رمز پویا را از پورت 8001 یعنی generator دریافت می‌کند و پیغام مناسب را به سمت فرانت برمی‌گرداند. داکرفایل این زیرسرویس به مطابق شکل زیر می‌باشد:

<img width="1680" alt="Screenshot 1402-03-08 at 8 23 30 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/109ce25c-4dc7-42a5-adf4-4ec557e17a78">

کد و داکرفایل Genrator نیز مطابق تصاویر زیر می‌باشد:

<img width="1680" alt="Screenshot 1402-03-08 at 8 24 05 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/741e37cc-60ad-46b9-a19f-7aa6702d4f3c">

<img width="1680" alt="Screenshot 1402-03-08 at 8 24 12 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/3eb79de7-5891-4cee-ab44-7d3122c33c58">

همچنین کد کامل تمامی این زیرسیستم‌ها در پوشه‌ی مرتبط با آنها در ریپازیتوری قابل مشاهده است.

پس از نوشتن کد زیرسیستم‌ها و داکرفایل‌های آنها، عملیات build را بر روی هر سه‌ی آنها انجام می‌دهیم:

<img width="1680" alt="Screenshot 1402-03-08 at 8 09 54 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/aa399473-2ff2-465a-9e9f-a7e258747e9c">

<img width="1680" alt="Screenshot 1402-03-08 at 8 10 13 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/f4e9d13b-ff8f-4adb-957b-93087e1a6911">

<img width="1680" alt="Screenshot 1402-03-08 at 8 10 47 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/9009db62-1704-4c63-9e2d-942540bba2f0">


مشاهده می‌کنیم که Imageهای متناظر با هر میکروسرویس ایجاد شده‌است. حال، به run کردن این Imageها می‌پردازیم تا یک Container متناظر با هر Image ایجاد و اجرا شود. با استفاده از دستورات `docker ps` و `docker image ls` مشاهده می‌کنیم که Imageها و Containerها با موفقیت ایجاد شده و Containerها در حال اجرا روی پورت مناسب می‌باشند:

<img width="1680" alt="Screenshot 1402-03-08 at 8 11 16 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/19e1f3e5-dac9-4e33-9ee5-135d45c49fc5">

حال، با استفاده از مرورگر، برنامه‌ را تست می‌کنیم. ابتدا به localhost می‌رویم و مشاهده می‌کنیم که صفحه‌ی فرانت باز شده‌است:

<img width="1680" alt="Screenshot 1402-03-08 at 8 11 26 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/bb42983c-922a-44ad-8509-e11d72af2bc2">


با کلیک روی دکمه‌ی ‍Get Code مشاهده می‌کنیم که کد با موفقیت از Generator دریافت شده و پیغامی که بک‌اند تولید کرده برگردانده شده‌است:

<img width="1680" alt="Screenshot 1402-03-08 at 8 11 32 PM" src="https://github.com/arplusman/software-engineering-lab/assets/45389988/47b047cd-891d-4b4a-ab81-fe07f73366b7">


