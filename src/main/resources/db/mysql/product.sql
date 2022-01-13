-- -----------------------------------------------------------------------------
-- - Construction de la table des produits                                  ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_products (
                            id            int          		NOT NULL AUTO_INCREMENT,
                            label         VARCHAR(20)       NOT NULL,
                            price			DOUBLE 	       	NOT NULL,
                            id_supplier   INT          	,
                            PRIMARY KEY (`id`) USING BTREE,
                            FOREIGN KEY (id_supplier) REFERENCES T_supplier(id)
);