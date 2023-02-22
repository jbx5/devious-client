import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("HitSplatDefinition_fontsArchive")
   public static AbstractArchive HitSplatDefinition_fontsArchive;
   @ObfuscatedName("aj")
   @Export("executor")
   ExecutorService executor = Executors.newSingleThreadExecutor();
   @ObfuscatedName("al")
   @Export("future")
   Future future;

   SecureRandomFuture() {
      this.future = this.executor.submit(new SecureRandomCallable());
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "141845738"
   )
   @Export("shutdown")
   void shutdown() {
      this.executor.shutdown();
      this.executor = null;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2139546026"
   )
   @Export("isDone")
   boolean isDone() {
      return this.future.isDone();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "-1649323244"
   )
   @Export("get")
   SecureRandom get() {
      try {
         return (SecureRandom)this.future.get();
      } catch (Exception var2) {
         return class392.method7406();
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)[Lmf;",
      garbageValue = "1229624350"
   )
   static GameBuild[] method2123() {
      return new GameBuild[]{GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.RC};
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)[Lml;",
      garbageValue = "-8"
   )
   public static StudioGame[] method2124() {
      return new StudioGame[]{StudioGame.game5, StudioGame.oldscape, StudioGame.game3, StudioGame.runescape, StudioGame.game4, StudioGame.stellardawn};
   }
}
