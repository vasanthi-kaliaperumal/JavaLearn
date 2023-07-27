package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.AA_FunctionExamples;

public class UsdToInrImpl implements IUsdToInrConverter{

    @Override
    public double convert(int usd) {
        return usd*81.5;
    }
}
