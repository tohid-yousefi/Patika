# BinarySearchTree
<hr>

Bu dosya [Patika.dev](htttps://www.patika.dev) sitesinin "Veri Yapıları ve Algoritmalar" dersinin Binary Search Tree Projesini içermektedir.

<hr>

**[7, 5, 1, 8, 3, 6, 0, 9, 4, 2]**

* Yukarıda verilen dizisinin Binary-Search-Tree aşamalarını yazınız.

    * **Yanıt**
    1.  **7** sayısı Root'umuz olarak belirlenir
    2. **5** sayısı 7'den küçük olduğu için soluna eklenir
    3. **1** sayısı 7 ve 5'den küçük olduu için 5'in soluna eklenir
    4. **8** sayısı Root'umuzdan büyük olduğu için Root'un sağına eklenir
    5. **3** sayısı 7 ve 5'ten küçük ve 1'den b]y]k olduğu için 1'in sağına eklenir
    6. **6** sayısı 7'den küçük ve 5'ten büyük olduğu için 5'in sağına eklenir
    7. **0** sayısı 7,5 ve 1'den küçük olduğu için 1'in soluna eklenir
    8. **9** sayısı 7 ve 8'den büyük olduğu için 8'in sağına eklenir
    9. **4** sayısı 7 ve 5'ten küçük ve 3'ten büyük olduğu için 3'ün sağına eklenir
    10. **2** sayısı 7 ve 5'ten küçük ve 1'den büyük olduğu için ve aynı zamanda 3'ten küçük olduğu için 3'ün soluna eklenir 

    <pre><h2>

                      7
            
                  5        8

             1       6          9

          0     3  

            2      4    

    </h2></pre>

    
