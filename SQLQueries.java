public class SQLQueries {

    2) SELECT kitapadi
    FROM kitap as k
    LEFT JOIN tur as t ON k.turno=t.turno
    WHERE turadi IN ('Fıkra','hikaye');

    3)  SELECT o.ogrno,o.ograd,o. ogrsoyad,k.kitapadi
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno=k.kitapno
    WHERE sinif IN ('10A','10B');
    4) SELECT o.ograd,o. ogrsoyad,i.atarih
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno;
    5) SELECT kitapadi
    FROM kitap as k
    LEFT JOIN tur as t ON k.turno=t.turno
    WHERE turadi IN ('Fıkra','hikaye');
    6)SELECT o.ogrno,o.ograd,o. ogrsoyad,k.kitapadi
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno=k.kitapno
    WHERE sinif IN ('10A','10B')
    ORDER BY ograd ;
    7)SELECT o.ograd,o. ogrsoyad,i.atarih
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno;
    8)SELECT o.ograd
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    WHERE i.atarih IS NULL;
    9) select i. kitapno,k.kitapadi,COUNT(i. kitapno)
    from islem as i
    LEFT JOIN kitap as k ON i.kitapno = k.kitapno;
    GROUP BY i.kitapno,k.kitapadi;
    10) select k.kitapno,k.kitapadi,COUNT(i. kitapno)
    from kitap as k
    LEFT JOIN islem as i ON i.kitapno = k.kitapno
    GROUP BY k.kitapno,k.kitapadi;
    11)SELECT ograd,ogrsoyad,kitapadi
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno=k.kitapno;
    12) SELECT ograd,ogrsoyad,kitapadi,yazarad, yazarsoyad,turadi,atarih
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno = k.kitapno
    LEFT JOIN yazar as y ON y. yazarno = k. yazarno
    LEFT JOIN tur as t ON k.turno=t.turno;
    13)select ograd, ogrsoyad,COUNT(atarih)
    from ogrenci as o
    LEFT JOIN islem i ON i.ogrno=o.ogrno
    GROUP BY ograd,ogrsoyad;
    14) select AVG(sayfasayisi) from kitap;
    15)select kitapadi ,AVG(sayfasayisi)
    from kitap
    GROUP BY kitapadi
    HAVING AVG(sayfasayisi)>(SELECT AVG(sayfasayisi) FROM kitap);
    16)SELECT COUNT(*)
    FROM ogrenci;
    17)SELECT COUNT(*) as toplam_sayi
    FROM ogrenci;
    18)SELECT ograd
    FROM ogrenci
    GROUP BY ograd;
    19)SELECT MAX(sayfasayisi)
    from kitap;
    20)SELECT kitapadi,sayfasayisi
    from kitap
    where sayfasayisi=(SELECT MAX(sayfasayisi) FROM kitap);
    21)SELECT MIN(sayfasayisi)
    from kitap;
    22)SELECT kitapadi,sayfasayisi
    from kitap
    where sayfasayisi=(SELECT MIN(sayfasayisi) FROM kitap);
    23)SELECT MAX(sayfasayisi)
    from kitap as k
    LEFT JOIN tur as t ON k.turno=t.turno
    WHERE turadi="Dram";
    24)SELECT SUM(sayfasayisi)
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno = k.kitapno
    WHERE o.ogrno=15;
    25)SELECT ograd,COUNT(ograd) as toplam
    FROM ogrenci
    GROUP BY ograd;
    26)SELECT sinif,COUNT(ograd) as toplam
    FROM ogrenci
    GROUP BY sinif;
    27)SELECT sinif,
    COUNT(CASE WHEN cinsiyet = 'E' THEN 1 ELSE NULL END) AS Males,
    COUNT(CASE WHEN cinsiyet = 'K' THEN 1 ELSE NULL END) AS Females
    FROM ogrenci
    GROUP BY sinif;
    28)SELECT ograd, ogrsoyad,SUM(sayfasayisi)
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno = k.kitapno
    GROUP BY ograd, ogrsoyad;
    29)SELECT ograd, ogrsoyad,COUNT(i.kitapno)
    FROM ogrenci as o
    LEFT JOIN islem as i ON i.ogrno=o.ogrno
    LEFT JOIN kitap as k ON i.kitapno = k.kitapno
    GROUP BY ograd, ogrsoyad;
}
