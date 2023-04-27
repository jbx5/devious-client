import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
@Implements("UserList")
public abstract class UserList {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -734344935
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -940640785
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "[Lpw;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("ao")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("ax")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("ai")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lpw;",
      garbageValue = "1756938494"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)[Lpw;",
      garbageValue = "-463450295"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-451237625"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1008276896"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1264370893"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.capacity == this.size;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(Ltm;I)Z",
      garbageValue = "-958577890"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Ltm;I)Lpw;",
      garbageValue = "-1266081918"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Ltm;S)Lpw;",
      garbageValue = "197"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Ltm;I)Lpw;",
      garbageValue = "-34701339"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Ltm;S)Z",
      garbageValue = "-24190"
   )
   @Export("removeByUsername")
   public final boolean removeByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      if (var2 == null) {
         return false;
      } else {
         this.remove(var2);
         return true;
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(Lpw;I)V",
      garbageValue = "-1811641406"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Ltm;B)Lpw;",
      garbageValue = "31"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Ltm;Ltm;B)Lpw;",
      garbageValue = "-111"
   )
   @Export("addLast")
   User addLast(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance();
         var3.set(var1, var2);
         this.arrayAddLast(var3);
         this.mapPut(var3);
         return var3;
      }
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(II)Lpw;",
      garbageValue = "-74669048"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "43"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Lpw;Ltm;Ltm;I)V",
      garbageValue = "-992785057"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Lpw;I)I",
      garbageValue = "-493827826"
   )
   @Export("indexOf")
   final int indexOf(User var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Lpw;B)V",
      garbageValue = "54"
   )
   @Export("mapRemove")
   final void mapRemove(User var1) {
      if (this.usernamesMap.remove(var1.username) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
         }

      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Lpw;B)V",
      garbageValue = "-118"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Lpw;I)V",
      garbageValue = "-93307052"
   )
   @Export("mapPut")
   final void mapPut(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (var2 != null && var2 != var1) {
            var2.previousUsername = null;
         }
      }

   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-47"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "357528038"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;B)V",
      garbageValue = "78"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }
}
