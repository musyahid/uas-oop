CREATE TABLE `tbl_barang` (
	`kode_barang` CHAR(5) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`nama_barang` VARCHAR(255) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`id_kategori` INT(11) NULL DEFAULT NULL,
	`harga` INT(11) NULL DEFAULT NULL,
	`expired_at` DATE NULL DEFAULT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
