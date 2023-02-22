import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bb")
@Implements("SoundCache")
public class SoundCache {
   @ObfuscatedName("an")
   @Export("cacheDir")
   static File cacheDir;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("soundEffectIndex")
   AbstractArchive soundEffectIndex;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("musicSampleIndex")
   AbstractArchive musicSampleIndex;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("musicSamples")
   NodeHashTable musicSamples = new NodeHashTable(256);
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("rawSounds")
   NodeHashTable rawSounds = new NodeHashTable(256);

   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;)V"
   )
   public SoundCache(AbstractArchive var1, AbstractArchive var2) {
      this.soundEffectIndex = var1;
      this.musicSampleIndex = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II[II)Lbe;",
      garbageValue = "-234093775"
   )
   @Export("getSoundEffect0")
   RawSound getSoundEffect0(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      RawSound var7 = (RawSound)this.rawSounds.get(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
         if (var8 == null) {
            return null;
         } else {
            var7 = var8.toRawSound();
            this.rawSounds.put(var7, var5);
            if (var3 != null) {
               var3[0] -= var7.samples.length;
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II[IS)Lbe;",
      garbageValue = "17177"
   )
   @Export("getMusicSample0")
   RawSound getMusicSample0(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      RawSound var7 = (RawSound)this.rawSounds.get(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5);
         if (var8 == null) {
            var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
            if (var8 == null) {
               return null;
            }

            this.musicSamples.put(var8, var5);
         }

         var7 = var8.toRawSound(var3);
         if (var7 == null) {
            return null;
         } else {
            var8.remove();
            this.rawSounds.put(var7, var5);
            return var7;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I[II)Lbe;",
      garbageValue = "1998431104"
   )
   @Export("getSoundEffect")
   public RawSound getSoundEffect(int var1, int[] var2) {
      if (this.soundEffectIndex.getGroupCount() == 1) {
         return this.getSoundEffect0(0, var1, var2);
      } else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
         return this.getSoundEffect0(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I[II)Lbe;",
      garbageValue = "731877540"
   )
   @Export("getMusicSample")
   public RawSound getMusicSample(int var1, int[] var2) {
      if (this.musicSampleIndex.getGroupCount() == 1) {
         return this.getMusicSample0(0, var1, var2);
      } else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
         return this.getMusicSample0(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lne;II)Lsp;",
      garbageValue = "-973248165"
   )
   public static IndexedSprite method855(AbstractArchive var0, int var1) {
      byte[] var3 = var0.takeFileFlat(var1);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         class212.SpriteBuffer_decode(var3);
         var2 = true;
      }

      return !var2 ? null : class353.method6646();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "12"
   )
   static int method852(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
         var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
         var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_HASSUB) {
         int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
         if (var4 != null) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTOP) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
         return 1;
      } else if (var0 == 2707) {
         var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6191() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return World.method1830(var3);
      } else if (var0 == 2709) {
         var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
         return class420.method7841(var3);
      } else {
         return 2;
      }
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "(Ldh;B)Z",
      garbageValue = "1"
   )
   static boolean method853(Player var0) {
      if (Client.drawPlayerNames == 0) {
         return false;
      } else if (BuddyRankComparator.localPlayer != var0) {
         boolean var1 = (Client.drawPlayerNames & 4) != 0;
         boolean var2 = var1;
         if (!var1) {
            boolean var3 = (Client.drawPlayerNames & 1) != 0;
            var2 = var3 && var0.isFriend();
         }

         return var2 || ItemLayer.method4160() && var0.isFriendsChatMember();
      } else {
         return IgnoreList.method7455();
      }
   }

   @ObfuscatedName("mf")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-12"
   )
   @Export("clanKickUser")
   static final void clanKickUser(String var0) {
      if (ReflectionCheck.friendsChat != null) {
         PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
         var1.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var0));
         var1.packetBuffer.writeStringCp1252NullTerminated(var0);
         Client.packetWriter.addNode(var1);
      }
   }
}
