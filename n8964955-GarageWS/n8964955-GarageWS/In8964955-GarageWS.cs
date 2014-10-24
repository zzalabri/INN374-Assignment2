using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace n8964955_GarageWS {
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "In8964955_GarageWS" in both code and config file together.
    [ServiceContract]
    public interface In8964955_GarageWS {
        [OperationContract]
        void setAppointment(string plateNo);

        [OperationContract]
        string getAppointment(string plateNo);

        [OperationContract]
        int getCost(string carModel);
    }
}
