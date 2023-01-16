# # Inheritance ##########

class Pertokoan:
    nama_toko = 'Sinar Maju Jaya'
    diskon_akhir_tahun = 5000
    diskon_natal = 5000
    def __init__(self, nama_produk, harga):
        self.nama_produk = nama_produk
        self.harga = harga
        self.harga_diskon = 0

    def diskon(self):
        self.harga_diskon = self.diskon_akhir_tahun + self.diskon_natal
    def totalHarga(self):
        return self.harga - self.harga_diskon

class cabang(Pertokoan):
    def __init__(self, nama_produk, harga):
        super().__init__(nama_produk, harga)

toko = cabang('Sabun', 100000)
toko.diskon()
print(f'Nama Toko : {toko.__class__.nama_toko}')
print(f'Nama Produk : {toko.nama_produk}')
print(f'Harga : {toko.harga}')
print(f'Total Harga : {toko.totalHarga()}')