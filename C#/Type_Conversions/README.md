# Patika C# Dersleri - Tip Dönüşümleri Ödevi

<hr />

### Patika C# dersleri kapsamında üçüncü ödev olarak Tip Dönüşümleri nasıl yapılır onu öğrendik.

**Tip Dönüşümleri**

Bir değişken tanımlaması yaptığımızda bellekten o değişkenin tipine bağlı olarak bir alan tesis etmiş oluruz. Dolayısıyla tanımladığımız bu değişkene farklı veri tipinde bir değer atanması bellekte işlerin karışmasına neden olabilir.

Çoğu zaman uygulama yazarken farklı veri tipleri ile çalışmak durumunda kalabiliriz. Bellekte işleri yoluna koyabilmek için bu tip durumlarda tip dönüşümü yapmamız gerekir.

Tip dönüşümleri 2 şekilde yapılabilir:

* Implicit Conversion (Bilinçsiz ya da kapalı dönüşüm)
* Explicit Conversion (Bilinçli ya da açık dönüşüm)

**Implicit Conversion**

Bir değişkenin kendinden daha yüksek kapasiteli bir değişkene atanmasıdır. Hedef değişkenin veri tipi bellekte yeterli alana sahip olacağından, bu dönüşümde bir veri kaybı söz konusu olmayacaktır. Dolayısıyla bu dönüşüm kendiliğinden yapılabilir.

**Explicit Conversion**

Bu yöntemde dönüşümleri developer'ın yapıyor olması gerekiyor. Dönüşüm için farklı yöntemler mevcut.

* (Variable)
* ToString
* Convert
* Parse
