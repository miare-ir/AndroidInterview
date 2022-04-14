package ir.miare.interview.tools

import retrofit2.Retrofit

class Libraries {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://random.com")
        .build()

    fun updateMyLocation(location: Location) {
        // Q8: Can we update the location asynchronously with 15 seconds of read time out?
    }
}

class Location

interface LocationAPI {
    fun updateLocation() {
        /**
         * URL:            https://random.com/location/update
         * Method:         POST
         * Body:           {"lat": 1.234, "lng": 2.345}
         *
         * Response Body:  {
         *                    "status": 200,
         *                    "last_locations": [
         *                      {"lat": 1.234, "lng": 2.345},
         *                      {"lat": 1.235, "lng": 2.346},
         *                      {"lat": 1.236, "lng": 2.347}
         *                    ]
         *                  }
         *
         * Error Response: {
         *                    "status": 400,
         *                    "error": "invalid_location"
         *                  }
         */
        // Q7: Can we implement the above API here
    }
}
