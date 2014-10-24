using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace n8964955_GarageWS {
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "n8964955_GarageWS" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select n8964955-GarageWS.svc or n8964955-GarageWS.svc.cs at the Solution Explorer and start debugging.

    public class n8964955_GarageWS : In8964955_GarageWS {

        private string plateNo;
        private string apppointmentDate;

        public void setAppointment(string plateNo) {
            this.plateNo = plateNo;
            this.apppointmentDate = setDate();
        }

        public string getAppointment(string plateNo) {
            this.apppointmentDate = setDate();
            return this.apppointmentDate;
        }

        private string setDate(){
            Random rnd = new Random();
            DateTime appDate = DateTime.Now.AddDays(rnd.Next(1, 30));

            return appDate.ToString("dd/MM/yy H:mm");
        }

        public int getCost(string carModel) {
            switch (carModel) {
                case "Audi A3":
                    return 47316;

                case "Hyundai i30":
                    return 29572;

                case "VW Phaeton":
                    return 41400;

                default:
                    return 39429;

            }
        }
    }
}
