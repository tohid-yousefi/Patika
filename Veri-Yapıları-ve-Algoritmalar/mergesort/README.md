# mergesort
<hr>

Bu dosya [Patika.dev](htttps://www.patika.dev) sitesinin "Veri Yapıları ve Algoritmalar" dersinin Merge Sort Projesini içermektedir.

<hr>

**[16,21,11,8,12,22]**  *Merge Sort*

* Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

    * **Yanıt**
    <pre>
                             [16,21,11,8,12,22] 
                             
                  [16,21,11]                    [8,12,22]
                  
         [16,21]   [11]                               [8,12]  [22]
         
   [16]  [21]  [11]                                        [8] [12] [22]
   
          [11,16] [21]                                [8,12]  [22]
          
                 [11,16,21]                      [8,12,22]
                 
                             [8,11,12,16,21,22]
</pre>

* Big-O gösterimini yazınız.
    
    * **Yanıt**
    
    O(nlogn) => O(6log6)
