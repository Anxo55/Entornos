package Documentacion;

// public float getGastoTotalConIva(float gastoTotal, float IVA) throws NumberFormatException {
//     if (gastoTotal < 0 || IVA < 0) {
//         throw new NumberFormatException();
//     }
//     return gastoTotal * IVA + gastoTotal;
// }

/**
    * Calcula el gasto aplicando el IVA
    * @param gastoTotal el gasto sin IVA
    * @param IVA el IVA a aplicar
    * @return el gasto con IVA
    * @throws NumberFormatException si el IVA o el gasto total es menor que 0
    */
    public float getGastoTotalConIva(float gastoTotal, float IVA) throws NumberFormatException {
        if (gastoTotal < 0 || IVA < 0) {
            throw new NumberFormatException();
        }
        return gastoTotal * IVA + gastoTotal;
    }
 
 

