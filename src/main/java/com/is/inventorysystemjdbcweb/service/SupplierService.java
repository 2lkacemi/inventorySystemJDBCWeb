package com.is.inventorysystemjdbcweb.service;

import com.is.inventorysystemjdbcweb.dao.SupplierRepository;
import com.is.inventorysystemjdbcweb.model.Supplier;

import java.sql.SQLException;
import java.util.List;

public class SupplierService {

    SupplierRepository supplierRepository = new SupplierRepository();

    public void deleteSupplier(int id){
        supplierRepository.deleteSupplier(id);
    }

    public void addSupplier(Supplier supplier){
        supplierRepository.insertSupplier(supplier);
    }

    public Supplier getSupplier(int id) throws SQLException {
        return supplierRepository.selectSupplierById(id);
    }

    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierRepository.selectAllSuppliers();
    }

    public void updateSupplier(int id, Supplier supplier){
        supplierRepository.updateSupplier(id, supplier);
    }
}
