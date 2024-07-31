import java.time.LocalDate;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanMember;
public class RuneLiteClanMember implements ClanMember {
	public final int idx;

	public final ClanSettings clanSettings;

	public RuneLiteClanMember(ClanSettings clanSettings, int idx) {
		this.clanSettings = clanSettings;
		this.idx = idx;
	}

	public ClanRank getRank() {
		return getClanRank(this.clanSettings.memberRanks[this.idx]);
	}

	@Override
	public LocalDate getJoinDate() {
		int memberJoinDate = this.clanSettings.memberJoinDates[this.idx];
		return LocalDate.ofEpochDay((long)(11745 + memberJoinDate));
	}

	public String getName() {
		return this.clanSettings.memberNames[this.idx];
	}

	public ClanRank getClanRank(int rank) {
		return new ClanRank(rank);
	}

	public boolean instanceOf(Object o) {
		return o instanceof RuneLiteClanMember;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof RuneLiteClanMember)) {
			return false;
		} else {
			RuneLiteClanMember clanMember = ((RuneLiteClanMember) (o));
			if (!clanMember.instanceOf(this)) {
				return false;
			} else {
				String thisName = this.getName();
				String objName = clanMember.getName();
				if (thisName == null) {
					if (objName != null) {
						return false;
					}
				} else if (!thisName.equals(objName)) {
					return false;
				}
				ClanRank thisRank = this.getRank();
				ClanRank objRank = clanMember.getRank();
				if (thisRank == null) {
					if (objRank != null) {
						return false;
					}
				} else if (!thisRank.equals(objRank)) {
					return false;
				}
				return true;
			}
		}
	}

	@Override
	public int hashCode() {
		byte b = 1;
		String name = this.getName();
		int hash = b * 59 + (name == null ? 43 : name.hashCode());
		ClanRank rank = this.getRank();
		hash = hash * 59 + (rank == null ? 43 : rank.hashCode());
		return hash;
	}

	public String toString() {
		return "ClanMemberImpl(getName=" + this.getName() + ", getRank=" + this.getRank() + ")";
	}
}