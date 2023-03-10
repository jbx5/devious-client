import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class462 extends class426 implements class271 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   final AbstractArchive field4849;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   final DemotingHashTable field4850 = new DemotingHashTable(64);
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1603104357
   )
   final int field4851;

   @ObfuscatedSignature(
      descriptor = "(Lml;ILnq;Lne;)V"
   )
   public class462(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
      super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
      this.field4849 = var4;
      this.field4851 = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Lqd;",
      garbageValue = "-1357061563"
   )
   protected class428 vmethod8424(int var1) {
      synchronized(this.field4850) {
         class427 var2 = (class427)this.field4850.get((long)var1);
         if (var2 == null) {
            var2 = this.method8431(var1);
            this.field4850.method5383(var2, (long)var1);
         }

         return var2;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)Lqf;",
      garbageValue = "-1434656279"
   )
   class427 method8431(int var1) {
      byte[] var2 = this.field4849.takeFile(this.field4851, var1);
      class427 var3 = new class427(var1);
      if (var2 != null) {
         var3.method7957(new Buffer(var2));
      }

      return var3;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1207683194"
   )
   public void method8423() {
      synchronized(this.field4850) {
         this.field4850.clear();
      }
   }

   public Iterator iterator() {
      return new class461(this);
   }

   @ObfuscatedName("nb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1719486946"
   )
   static void method8434() {
      if (Language.field4294 != null) {
         Client.field574 = Client.cycle;
         Language.field4294.method6622();

         for(int var0 = 0; var0 < Client.players.length; ++var0) {
            if (Client.players[var0] != null) {
               Language.field4294.method6607(GameEngine.baseX * 64 + (Client.players[var0].x >> 7), class178.baseY * 64 + (Client.players[var0].y >> 7));
            }
         }
      }

   }
}
