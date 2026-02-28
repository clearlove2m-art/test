public class ArrayAverage {
    
    /**
     * 计算整数数组的平均值
     * 
     * @param numbers 整数数组
     * @return 数组的平均值
     * @throws IllegalArgumentException 当数组为null或为空时抛出异常
     */
    public static double calculateAverage(int[] numbers) {
        // 检查数组是否为null
        if (numbers == null) {
            throw new IllegalArgumentException("数组不能为null");
        }
        
        // 检查数组是否为空
        if (numbers.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        
        // 计算数组元素的总和
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        // 返回平均值
        return (double) sum / numbers.length;
    }
    
    // 使用示例
    public static void main(String[] args) {
        try {
            // 正常情况
            int[] arr1 = {10, 20, 30, 40, 50};
            System.out.println("数组 [10, 20, 30, 40, 50] 的平均值: " + calculateAverage(arr1));
            
            // 单个元素
            int[] arr2 = {100};
            System.out.println("数组 [100] 的平均值: " + calculateAverage(arr2));
            
            // 空数组会抛出异常
            int[] arr3 = {};
            System.out.println("数组 [] 的平均值: " + calculateAverage(arr3));
            
        } catch (IllegalArgumentException e) {
            System.out.println("异常: " + e.getMessage());
        }
        
        try {
            // null数组会抛出异常
            System.out.println("数组 null 的平均值: " + calculateAverage(null));
        } catch (IllegalArgumentException e) {
            System.out.println("异常: " + e.getMessage());
        }
    }
}