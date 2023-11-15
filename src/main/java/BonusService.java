public class BonusService {
    /**
     * При пополнении счета зарегистрированный клиент получает бонус в размере 3% и не зарегистрированный - 1%.
     * Максимальный бонус 500.
     * @amount - сумма пополнения
     * @registered - клиент зарегистрированный/не зарегистрированный
     * @return - количество бонусов
     */
    public long calcBonus(long amount, boolean registered) {
        long  percent = registered ? 3 : 1;
        long  bonus = amount * percent / 100;
        long  limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
