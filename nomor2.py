# # Encapsulation ##########
# Public access (atribut nama_toko, nama_produk)
# Private access (atribut __diskon_akhir_tahun, __diskon_natal, __harga, __harga_diskon)

class Pertokoan:
    nama_toko = 'Sinar Maju Jaya'
    __diskon_akhir_tahun = 5000
    __diskon_natal = 5000
    def __init__(self, nama_produk, harga):
        self.nama_produk = nama_produk
        self.__harga = harga
        self.__harga_diskon = 0

    def diskon(self):
        self.__harga_diskon = self.__diskon_akhir_tahun + self.__diskon_natal
    def totalHarga(self):
        return self.__harga - self.__harga_diskon

class cabang(Pertokoan):
    def __init__(self, nama_produk, harga):
        super().__init__(nama_produk, harga)

toko = cabang('Sabun', 100000)
toko.diskon()
print(f'Nama Toko : {toko.__class__.nama_toko}')
print(f'Nama Produk : {toko.nama_produk}')
print(f'Total Harga : {toko.totalHarga()}')