package pack.business;

import java.util.List;

import pack.model.SangpumDto;
import pack.model.SangpumInter;

public class BusinessImpl implements BusinessInter {
	private SangpumInter sangpumInter;
	
	public BusinessImpl(SangpumInter sangpumInter) {
		this.sangpumInter = sangpumInter;
	}
	
	public void dataList() {
		List<SangpumDto> list = sangpumInter.selectDataAll();
			
		for(SangpumDto s : list) {
			System.out.println(s.getCode() + " " + s.getSang() + " " + s.getSu() + " " + s.getDan());
		}
	}
}