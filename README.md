# Stock Sınıfı Ödevi

Bu ödevde Java kullanılarak bir `Stock` sınıfı oluşturulmuştur.

## Amaç

Bir hissenin sembolünü, adını, önceki kapanış fiyatını ve güncel fiyatını tutmak ve fiyat değişim yüzdesini hesaplamak.

## Stock Sınıfı

Sınıf içerisinde şu değişkenler bulunmaktadır:

- `symbol`
- `name`
- `previousClosingPrice`
- `currentPrice`

Ayrıca:

- Parametreli constructor
- `getChangePercent()` metodu

kullanılmıştır.

## Kullanılan Değerler

- Stock Symbol: `ORCL`
- Stock Name: `Oracle Corporation`
- Previous Closing Price: `34.5`
- Current Price: `34.35`

## Hesaplama

Fiyat değişim yüzdesi şu formülle hesaplanmıştır:

`((currentPrice - previousClosingPrice) / previousClosingPrice) * 100`

## Dosyalar

- `Stock.java` → Stock sınıfını içerir.
- `Odev2.java` → Stock nesnesinin oluşturulduğu ve sonuçların ekrana yazdırıldığı ana dosyadır.

## Kullanılan Teknoloji

- Java
- Apache NetBeans
