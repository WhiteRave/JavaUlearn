public class Handler {
    //создайте новые классы ошибок NullHandlerException, HandlerException и HandlerResultException, наследуемые от RuntimeException
    public int handleResults(String input) {
        //реализуйте код метода handleResults
        if (input == null || input.isEmpty()) {
            throw new NullHandlerException("");
        }

        if (input.contains("error")) {
            throw new HandlerException("");
        }

        var data = input.split("\\.");

        if (data.length != 4) {
            return 0;
        }

        var intData = new int[data.length];

        try {
            for (var i = 0; i < data.length; i++) {
                intData[i] = Integer.parseInt(data[i]);
            }
        } catch (Exception e) {
            return 0;
        }

        var result = intData[0] + intData[1] - intData[2] * intData[3];

        if (result < 0) {
            throw new HandlerResultException("");
        }

        return result;
    }


    public static class NullHandlerException extends RuntimeException {
        public NullHandlerException(String message) {
            super(message);
        }
    }

    public static class HandlerException extends RuntimeException {
        public HandlerException(String message) {
            super(message);
        }
    }

    public static class HandlerResultException extends RuntimeException {
        public HandlerResultException(String message) {
            super(message);
        }
    }
}

