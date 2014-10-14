using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace n8911371WarehouseService
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IWarehouseService" in both code and config file together.
    [ServiceContract]
    public interface IWarehouseService
    {
        [OperationContract]
        bool IsExistComponentNo(string componentNo);

        [OperationContract]
        string GetComponentName(String componentNo);

        [OperationContract]
        int GetCost(String componentNo);

        [OperationContract]
        int GetAmount(String componentNo);

        [OperationContract]
        Warehouse GetComponent(String componentNo);

        [OperationContract]
        bool CheckAmount(string componentNo, int exceptUsedAmount);

        [OperationContract]
        bool ConsumedAmount(string componentNo, int exceptConsumedAmount);

        [OperationContract]
        bool UpdatedAmount(string componentNo, int updatedAmount);
    }
}
