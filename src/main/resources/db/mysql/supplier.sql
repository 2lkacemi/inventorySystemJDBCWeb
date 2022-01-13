-- -----------------------------------------------------------------------------
-- - Construction de la table des fournisseurs                                  ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_supplier (
                            `id`           INT          		NOT NULL AUTO_INCREMENT,
                            `name`         VARCHAR(20)        NOT NULL,
                            `city`			  VARCHAR(20)		   NOT NULL,
                            PRIMARY KEY (`id`) USING BTREE
);