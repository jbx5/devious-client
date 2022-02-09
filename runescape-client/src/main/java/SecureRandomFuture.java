import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bv")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
    @ObfuscatedName("c")
    @Export("executor")
    ExecutorService executor;

    @ObfuscatedName("l")
    @Export("future")
    Future future;

    SecureRandomFuture() {
        this.executor = Executors.newSingleThreadExecutor();
        this.future = this.executor.submit(new SecureRandomCallable());
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1784688663")
    @Export("shutdown")
    void shutdown() {
        this.executor.shutdown();
        this.executor = null;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-330210944")
    @Export("isDone")
    boolean isDone() {
        return this.future.isDone();
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)Ljava/security/SecureRandom;", garbageValue = "-18")
    @Export("get")
    SecureRandom get() {
        try {
            return ((SecureRandom) (this.future.get()));
        } catch (Exception var4) {
            SecureRandom var3 = new SecureRandom();
            var3.nextInt();
            return var3;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ldt;FI)F", garbageValue = "63435213")
    static float method1973(class115 var0, float var1) {
        if (var0 == null) {
            return 0.0F;
        } else {
            float var2 = var1 - var0.field1423;
            return (var2 * (var0.field1425[2] + (var2 * (var0.field1425[1] + (var2 * var0.field1425[0]))))) + var0.field1425[3];
        }
    }
}