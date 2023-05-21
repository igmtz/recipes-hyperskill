class Solution {    
    Product convertProductDTOToProduct(ProductDTO dto) {
        int year = 2023;
        int month = 1;
        int day = 15;
        LocalDate date = LocalDate.of(year, month, day);
        return new Product(dto.getId(), dto.getModel(), dto.getPrice(), date, "SuperVendor");
    }
}
