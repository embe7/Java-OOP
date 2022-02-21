package OOP30.FinalMethod;

/**
 * Final Method
 * - kata kunci final juga bisa digunakan di method
 * - jika sebuah method menggunakan kata kunci final, maka artinya method tersebut tidak bisa di
 *   overide di class child nya.
 * - ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi
 *   oleh class child nya.
 */

class FinalMethodApp {

}

class Final extends FinalMethodApp{
    final void login(String UserName, String password){

    }
}

class FakeFinal extends Final{
    //Error
    // void login(String UserName, String password){

    // }
}
