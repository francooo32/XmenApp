package com.mutants.xmen.model;


public class AdnDB {
    
    private int count_mutant_dna;
    
    private int count_human_dna;

    public AdnDB(int count_mutant_dna, int count_human_dna) {
        this.count_mutant_dna = count_mutant_dna;
        this.count_human_dna = count_human_dna;
    }


    public AdnDB() {
    }


	public int getCount_mutant_dna() {
		return count_mutant_dna;
	}


	public void setCount_mutant_dna(int count_mutant_dna) {
		this.count_mutant_dna = count_mutant_dna;
	}


	public int getCount_human_dna() {
		return count_human_dna;
	}


	public void setCount_human_dna(int count_human_dna) {
		this.count_human_dna = count_human_dna;
	}
    
    

}


